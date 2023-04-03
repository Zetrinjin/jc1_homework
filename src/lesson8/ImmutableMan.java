package lesson8;

public final class ImmutableMan {

       private final int hairLenght;//private нужен для того что бы оно читалось
       private final String name;
       private final MutableAddress address;

        public ImmutableMan(String name,int hairLenght, MutableAddress address)//делаем неприкасаемыми
        {
            this.name = name;
            this.hairLenght = hairLenght;
            this.address = address;
        }
        public String getName(){
            return name;
        }
        public int getHairLenght(){
            return hairLenght;
        }

        public MutableAddress getAddress(){
            MutableAddress addressCopy = new MutableAddress(//делаем копию, копируем туда значения, и возвращаем их,при этом оригинал отсется тем же
                    address.getCity(),address.getStreet()
            );
            return addressCopy;
        }
}

class MutableAddress {
    private String city;
    private String street;

    public MutableAddress(String city, String street) {
        this.city = city;
        this.street = street;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
