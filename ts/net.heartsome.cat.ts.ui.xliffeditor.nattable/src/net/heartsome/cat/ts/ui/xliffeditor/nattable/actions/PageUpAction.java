package net.heartsome.cat.ts.ui.xliffeditor.nattable.actions;

import net.heartsome.cat.ts.ui.xliffeditor.nattable.editor.HsMultiActiveCellEditor;
import net.heartsome.cat.ts.ui.xliffeditor.nattable.editor.HsMultiCellEditorControl;
import net.heartsome.cat.ts.ui.xliffeditor.nattable.editor.XLIFFEditorImplWithNatTable;
import net.sourceforge.nattable.NatTable;
import net.sourceforge.nattable.selection.SelectionLayer.MoveDirectionEnum;
import net.sourceforge.nattable.selection.action.AbstractKeySelectAction;
import net.sourceforge.nattable.selection.command.ScrollSelectionCommand;

import org.eclipse.swt.events.KeyEvent;

public class PageUpAction extends AbstractKeySelectAction {

	public PageUpAction() {
		super(MoveDirectionEnum.UP);
	}

	public void run(NatTable natTable, KeyEvent event) {
		HsMultiActiveCellEditor.commit(true);
		super.run(natTable, event);
		natTable.doCommand(new ScrollSelectionCommand(MoveDirectionEnum.UP, isShiftMask(), isControlMask()));
		HsMultiCellEditorControl.activeSourceAndTargetCell(XLIFFEditorImplWithNatTable.getCurrent());
	}

}
