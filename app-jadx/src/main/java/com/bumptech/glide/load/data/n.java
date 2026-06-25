package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class n extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final UriMatcher f35720e;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f35720e = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public n(ContentResolver contentResolver, Uri uri, boolean z10) {
        super(contentResolver, uri, z10);
    }

    private InputStream j(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int iMatch = f35720e.match(uri);
        if (iMatch != 1) {
            if (iMatch == 3) {
                return k(contentResolver, uri);
            }
            if (iMatch != 5) {
                return (this.f35716a && T4.c.d(uri) && T4.c.c()) ? l(uri, contentResolver) : contentResolver.openInputStream(uri);
            }
        }
        Uri uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uriLookupContact != null) {
            return k(contentResolver, uriLookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    private InputStream k(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    private InputStream l(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorH = T4.c.h(uri, contentResolver);
        if (assetFileDescriptorH != null) {
            try {
                return assetFileDescriptorH.createInputStream();
            } catch (IOException e10) {
                try {
                    assetFileDescriptorH.close();
                } catch (Exception unused) {
                }
                throw ((FileNotFoundException) new FileNotFoundException("Unable to create stream").initCause(e10));
            }
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return InputStream.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public InputStream f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream inputStreamJ = j(uri, contentResolver);
        if (inputStreamJ != null) {
            return inputStreamJ;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }
}
