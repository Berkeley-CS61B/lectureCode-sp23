package lec12_inheritance4;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;


/**
 * Created by hug.
 */
public class TestArraySetEquals {
    @Test
    public void testThreeEquals() {
        ArraySet<Integer> aset = new ArraySet<>();
        aset.add(5);
        aset.add(23);
        aset.add(42);

        //equals
        ArraySet<Integer> aset2 = new ArraySet<>();
        aset2.add(5);
        aset2.add(23);
        aset2.add(42);

       assertThat(aset).isEqualTo(aset2);
    }

    @Test
    public void testNotEquals1() {
        ArraySet<Integer> aset = new ArraySet<>();
        aset.add(5);
        aset.add(23);
        aset.add(42);
        aset.add(36);

        //equals
        ArraySet<Integer> aset2 = new ArraySet<>();
        aset2.add(5);
        aset2.add(23);
        aset2.add(42);

        assertThat(aset).isNotEqualTo(aset2);
    }

    @Test
    public void testNotEquals2() {
        ArraySet<Integer> aset = new ArraySet<>();
        aset.add(5);
        aset.add(23);
        aset.add(42);

        //equals
        ArraySet<Integer> aset2 = new ArraySet<>();
        aset2.add(5);
        aset2.add(23);
        aset2.add(42);
        aset2.add(36);

        assertThat(aset).isNotEqualTo(aset2);
    }
}
