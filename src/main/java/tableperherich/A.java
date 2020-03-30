package tableperherich;
import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//ham ye jis explain karte hai konse startergy ke through
// ye object ko map karna hai

@DiscriminatorColumn(name = "type")
@DiscriminatorValue("A")

public class A {
        int id;
        String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
