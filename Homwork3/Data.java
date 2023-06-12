package org.example;

public class Data implements AutoCloseable{
    private String Imya;
    private String Fam;
    private String Otch;
    private String DataRogd;
    private String Tel;
    private String Pol;

    public String getImya() {
        return Imya;
    }

    public void setImya(String imya) {
        Imya = imya;
    }

    public String getFam() {
        return Fam;
    }

    public void setFam(String fam) {
        Fam = fam;
    }

    public String getOtch() {
        return Otch;
    }

    public void setOtch(String otch) {
        Otch = otch;
    }

    public String getDataRogd() {
        return DataRogd;
    }

    public void setDataRogd(String dataRogd) {
        DataRogd = dataRogd;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public String getPol() {
        return Pol;
    }

    public void setPol(String pol) {
        Pol = pol;
    }

    @Override
    public String toString() {
        return  "< "+ Imya +" >,<" + Fam + " >,< " + Otch + " >,< " + DataRogd + " >,< " + Tel + " >,< " + Pol +" >";
    }

    @Override
    public void close() throws Exception {
        // TODO: 12.06.2023  
    }
}
