package com.example.listycitylab3;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class EditCityFragment extends DialogFragment {
    interface EditCityDialogListener {
        void editCity(City city);
    }
    private String city; // private = restricted access
    private String province;

    // Getter
    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    // Setter
    public void setCity(String city) {
        this.city = city;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    // make a constructor for the Fragment that takes in a City, and store the City in the Fragment as an instance variable
    public static void main(String[] args) {
        City city = new City(System.in.toString(), System.in.toString());
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        if (context instanceof EditCityFragment.EditCityDialogListener){
            EditCityDialogListener listener = (EditCityDialogListener) context;

        } else {
            throw new RuntimeException(context + "must implement AddCityDialogueListener");
        }
    }
    static EditCityFragment newInstance(String city, String province) {
        EditCityFragment fragment = new EditCityFragment();
        Bundle args = new Bundle();
        args.putSerializable("city", city);
        args.putSerializable("province", province);
        fragment.setArguments(args);
        return fragment;
    }



//    @NonNull
//    @Override
//    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
//        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_edit_city, null);
//        EditText editCityText = view.findViewById(R.id.Edit_City_Text);
//        EditText editProvinceText = view.findViewById(R.id.Edit_Province_Text);
//        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
//        return builder
//                .setView(view)
//                .setTitle("Add a City/province")
//                .setNegativeButton("Cancel", null)
//                .setPositiveButton("Add", (dialog, which) -> {
//                    String cityName = editCityText.getText().toString();
//                    String provinceName = editProvinceText.getText().toString();
//                    listener.editCity(new City(cityName, provinceName));
//
//                })
//                .create();
//    }
}


