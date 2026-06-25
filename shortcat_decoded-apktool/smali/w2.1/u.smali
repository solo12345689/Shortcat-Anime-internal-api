.class public final Lw2/u;
.super Lw2/v;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public constructor <init>(Ljava/io/IOException;Lw2/o;)V
    .locals 6

    .line 1
    const/16 v4, 0x7d7

    .line 2
    .line 3
    const/4 v5, 0x1

    .line 4
    const-string v1, "Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted"

    .line 5
    .line 6
    move-object v0, p0

    .line 7
    move-object v2, p1

    .line 8
    move-object v3, p2

    .line 9
    invoke-direct/range {v0 .. v5}, Lw2/v;-><init>(Ljava/lang/String;Ljava/io/IOException;Lw2/o;II)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
