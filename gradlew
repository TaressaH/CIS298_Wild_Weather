<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="30sp"
        android:textStyle="bold"
        android:gravity="center"
        android:text="@string/beverage_name" />

    <EditText
        android:id="@+id/beverage_name"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="@string/beverage_name_hint"
        android:inputType="text"
        android:textSize="24sp"
        android:textStyle="bold"
        android:padding="4dp" />

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textSize="24sp"
            android:layout_weight="0.5"
            android:text="@string/beverage_id" />

        <EditText
            android:id="@+id/beverage_id"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:hint="@string/beverage_id_hint"
            android:inputType="text"
            android:textSize="24sp"
            android:layout_weight="0.5"
            android:padding="4dp" />

    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textSize="24sp"
            android:layout_weight="0.5"
            android:text="@string/beverage_pack" />

        <EditText
            android:id="@+id/beverage_pack"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:hint="@string/beverage_pack_hint"
            android:layout_weight="0.5"
            android:inputType="text"
            android:textSize="24sp"
            android:padding="4dp" />

    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textSize="24sp"
            android:layout_weight="0.5"
            android:text="@string/beverage_price" />

        <EditText
            android:id="@+id/beverage_price"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:hint="@string/beverage_price_hint"
            android:inputType="numberDecimal"
            android:textSize="24sp"
            android:layout_weight="0.5"
            android:padding="4dp" />

    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textSize="24sp"
            android:layout_weight="0.5"
            android:text="@string/beverage_active" />

        <CheckBox
            android:id="@+id/beverage_active"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="0.5"
            android:padding="4dp" />

    </LinearLayout>

</LinearLayout>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                