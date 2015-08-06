package ca.laplanete.mobile.example.view;

public interface OnPageChangedListener {

    /**
     * called when the grid is scrolled to another page
     * @param sender grid
     * @param newPageNumber 0 based
     */
    public void onPageChanged(ca.laplanete.mobile.example.view.PagedDragDropGrid sender, int newPageNumber);
}
