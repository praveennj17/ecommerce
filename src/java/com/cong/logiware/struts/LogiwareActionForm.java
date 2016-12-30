package com.cong.logiware.struts;

import com.cong.logiware.constant.CommonConstant;
import com.cong.logiware.constant.MessageConstant;
import com.cong.logiware.util.CommonUtil;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import org.apache.catalina.User;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author sunil
 */
public class LogiwareActionForm extends ActionForm implements CommonConstant, MessageConstant {

    // id
    private Long id;
    // for parent id
    private Long parentId;
    // for child id
    private Long childId;
    // search Id
    private String searchId;
    // item index used while working with list.
    private Integer index;
    // item index used while working with list.
    private Integer parentIndex;
    // item index used while working with list.
    private Integer childIndex;
    // item index used while working with list.
    private long longIndex;
    // register event to notes.
    private String eventCode;
    // file number
    private String fileNumber;
    // Reference Number for PO and SO and CCI
    private String referenceNo;
    // file Id
    private Long fileId;
    // modele it could be FCL,LCL,AIR
    private String module;
    // submit value will be assined to button
    private String button;
    // next page to be displayed.
    private String page;
    // free text
    private String freeText;
    // errors encountered while performing operations.
    private Collection<String> errors = null;
    // Fields which leads error.
    private Collection<String> fields = null;
    // Label of fields to be blinked
    private Collection<String> blinks = null;
    private long userId;
    // To set the default tab.
    private Integer viewTabId;

    private String action;
    private Integer selectedPage = 1;
    private Integer selectedRows = 0;
    private Integer totalPages = 0;
    private Integer totalRows = 0;
    private String sortBy = "id";
    private String orderBy = "asc";

    public LogiwareActionForm() {
        index = -1;
        parentIndex = -1;
        childIndex = -1;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        if (id != null && id > 0) {
            this.id = id;
        }
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getParentIndex() {
        return parentIndex;
    }

    public void setParentIndex(Integer parentIndex) {
        this.parentIndex = parentIndex;
    }

    public Integer getChildIndex() {
        return childIndex;
    }

    public void setChildIndex(Integer childIndex) {
        this.childIndex = childIndex;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    public String getSearchId() {
        return searchId;
    }

    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    protected void addError(String error) {
        if (CommonUtil.isNull(errors)) {
            errors = new HashSet<String>();
        }
        errors.add(error);
    }

    protected void addBlink(String blink) {
        blinks.add(blink);
    }

    protected void addBlink(String blink, String error) {
        blinks.add(blink);
        errors.add(error);
    }

    protected void addError(String field, String error) {
        if (field.contains(",")) {
            fields.addAll(Arrays.asList(field.split(",")));
        } else {
            fields.add(field);
        }
        errors.add(error);
    }

    public Collection<String> getErrors() {
        return errors;
    }

    public void setErrors(Collection<String> errors) {
        this.errors = errors;
    }

    public Collection<String> getBlinks() {
        return blinks;
    }

    public void setBlinks(Collection<String> blinks) {
        this.blinks = blinks;
    }

    public String getEventCode() {
        return eventCode;
    }

    public void setEventCode(String eventCode) {
        this.eventCode = eventCode;
    }

    public Collection<String> getFields() {
        return fields;
    }

    public void setFields(Set<String> fields) {
        this.fields = fields;
    }

    public String getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public Long getChildId() {
        return childId;
    }

    public void setChildId(Long childId) {
        this.childId = childId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getFreeText() {
        return freeText;
    }

    public void setFreeText(String freeText) {
        this.freeText = freeText;
    }

    public long getLongIndex() {
        return longIndex;
    }

    public void setLongIndex(long longIndex) {
        this.longIndex = longIndex;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Integer getViewTabId() {
        return viewTabId;
    }

    public void setViewTabId(Integer viewTabId) {
        this.viewTabId = viewTabId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Integer getSelectedPage() {
        return selectedPage;
    }

    public void setSelectedPage(Integer selectedPage) {
        this.selectedPage = selectedPage;
    }

    public Integer getSelectedRows() {
        return selectedRows;
    }

    public void setSelectedRows(Integer selectedRows) {
        this.selectedRows = selectedRows;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors actionErrors = new ActionErrors();
        if (errors != null && errors.size() > 0) {
            ActionMessage message = new ActionMessage("DeFAUlT ErRoR");
            actionErrors.add("work", message);
            request.setAttribute("errors", errors);
            request.setAttribute("fields", fields);
            request.setAttribute("blinks", blinks);
        }
        return actionErrors;
    }

    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        super.reset(mapping, request);
        errors = new HashSet<>();
        fields = new HashSet<>();
        blinks = new HashSet<>();
        parentId = null;
        index = -1;
        parentIndex = -1;
        childIndex = -1;
        longIndex = -1;
        eventCode = null;
        fileNumber = null;
        fileId = -1L;
        module = null;
        button = null;
        freeText = null;
        viewTabId = 0;
    }
}
