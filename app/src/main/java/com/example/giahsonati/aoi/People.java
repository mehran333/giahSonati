package com.example.giahsonati.aoi;

import android.os.Parcel;
import android.os.Parcelable;


public class People implements Parcelable {
    private int Confirmed;
    private int Deaths;
    private int Recovered;

    public int getConfirmed() {
        return Confirmed;
    }

    public void setConfirmed(int confirmed) {
        Confirmed = confirmed;
    }

    public int getDeaths() {
        return Deaths;
    }

    public void setDeaths(int deaths) {
        Deaths = deaths;
    }

    public int getRecovered() {
        return Recovered;
    }

    public void setRecovered(int recovered) {
        Recovered = recovered;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.Confirmed);
        dest.writeInt(this.Deaths);
        dest.writeInt(this.Recovered);
    }

    public void readFromParcel(Parcel source) {
        this.Confirmed = source.readInt();
        this.Deaths = source.readInt();
        this.Recovered = source.readInt();
    }

    public People() {
    }

    protected People(Parcel in) {
        this.Confirmed = in.readInt();
        this.Deaths = in.readInt();
        this.Recovered = in.readInt();
    }

    public static final Parcelable.Creator<People> CREATOR = new Parcelable.Creator<People>() {
        @Override
        public People createFromParcel(Parcel source) {
            return new People(source);
        }

        @Override
        public People[] newArray(int size) {
            return new People[size];
        }
    };
}
