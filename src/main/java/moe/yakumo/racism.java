package moe.yakumo;

import java.util.ArrayList;

public class racism {
    public int ID;
    public wakasagihime EditionData;
    public double RawDownMultiplier;
    public double RawUpMultiplier;
    public String Link;
    public String Property;
    public int Snatched;
    public int Seeders;
    public int Leechers;
    public int Size;
    public int FileCount;
    public ArrayList<kogasa> FileList;
    public String UploadTime;

    public racism(int ID, wakasagihime EditionData, double RawDownMultiplier, double RawUpMultiplier, String Link, String Property, int Snatched, int Seeders, int Leechers, int Size, int FileCount, ArrayList<kogasa> FileList, String UploadTime){
        this.ID = ID;
        this.EditionData = EditionData;
        this.RawDownMultiplier = RawDownMultiplier;
        this.RawUpMultiplier = RawUpMultiplier;
        this.Link = Link;
        this.Property = Property;
        this.Snatched = Snatched;
        this.Seeders = Seeders;
        this.Leechers = Leechers;
        this.Size = Size;
        this.FileCount = FileCount;
        this.FileList = FileList;
        this.UploadTime = UploadTime;
    }
}
