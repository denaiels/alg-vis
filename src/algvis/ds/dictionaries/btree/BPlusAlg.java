package algvis.ds.dictionaries.btree;

import algvis.core.Algorithm;
import algvis.ui.view.REL;

public abstract class BPlusAlg extends Algorithm {
    protected final BPlusTree T;
    protected final int K;
    protected final String KS;

    public BPlusAlg(BPlusTree T, int x) {
        super(T.panel);
        this.T = T;
        K = x;
        KS = "" + K;
    }

    @Override
    abstract public void runAlgorithm();

    protected BPlusNode goToChild(BPlusNode w, BPlusNode v) {
        final int p = w.search(K);
        if (p == 0) {
            addStep(v, REL.TOP, "bfind0", KS, "" + w.keys[0]);
        } else if (p == w.numKeys) {
            addStep(v, REL.TOP, "bfindn", "" + w.keys[w.numKeys - 1], KS,
                "" + (w.numKeys + 1));
        } else {
            addStep(v, REL.TOP, "bfind", "" + w.keys[p - 1], KS, "" + w.keys[p],
                "" + (p + 1));
        }
        w = (BPlusNode) w.c[p];
        v.goAbove(w);
        pause();
        return w;
    }
}
