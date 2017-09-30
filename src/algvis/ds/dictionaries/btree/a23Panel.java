/*******************************************************************************
 * Copyright (c) 2012-present Jakub Kováč, Jozef Brandýs, Katarína Kotrlová,
 * Pavol Lukča, Ladislav Pápay, Viktor Tomkovič, Tatiana Tóthová
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package algvis.ds.dictionaries.btree;

import algvis.core.Settings;
import algvis.ui.DictButtons;
import algvis.ui.NewVisPanel;

public class a23Panel extends NewVisPanel {
    private static final long serialVersionUID = 3849830550882705599L;

    public a23Panel(Settings S) {
        super(S);
    }

    @Override
    public void initDS() {
        D = new a23Tree(this);
        scene.add(D);
        buttons = new DictButtons(this);
    }

    @Override
    public void start() {
        super.start();
        D.random(30);
    }
}
