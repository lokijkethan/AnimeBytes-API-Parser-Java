package moe.yakumo;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.ArrayList;

public class fujiwara {
    public int ID;
    public String CategoryName;
    public String FullName;
    public String GroupsName;
    public String SeriesID;
    public String SeriesName;
    public ArrayList<Sumireko> Artists;
    public String Year;
    public String Image;
    public String[] Synonyms;
    public int Snacthed;
    public int Comments;
    public yuyuko Links;
    public int Votes;
    public int AvgVote;
    public String Associations;
    public String Description;
    public String DescriptionHTML;
    public int EpCount;
    public String StudioList;
    public int PastWeek;
    public boolean Incomplete;
    public boolean Ongoing;
    public ArrayList<String> Tags;
    public ArrayList<racism> Torrents;

    public fujiwara(int ID, String CategoryName, String FullName, String GroupsName, String SeriesID, String SeriesName, ArrayList<Sumireko> Artists, String Year, String Image, String[] Synonyms, int Snacthed, int Comments, yuyuko Links, int Votes, int AvgVote, String Associations, String Description, String DescriptionHTML, int EpCount, String StudioList, int PastWeek, boolean Incomplete, boolean Ongoing, ArrayList<String> Tags, ArrayList<racism> Torrents){
        this.ID = ID;
        this.CategoryName = CategoryName;
        this.FullName = FullName;
        this.GroupsName = GroupsName;
        this.SeriesID = SeriesID;
        this.Artists = Artists;
        this.Year = Year;
        this.Image = Image;
        this.Synonyms = Synonyms;
        this.Snacthed = Snacthed;
        this.Comments = Comments;
        this.Links = Links;
        this.Votes = Votes;
        this.AvgVote = AvgVote;
        this.Associations = Associations;
        this.Description = Description;
        this.DescriptionHTML = DescriptionHTML;
        this.EpCount = EpCount;
        this.StudioList = StudioList;
        this.PastWeek = PastWeek;
        this.Incomplete = Incomplete;
        this.Ongoing = Ongoing;
        this.Tags = Tags;
        this.Torrents = Torrents;
    }

}
