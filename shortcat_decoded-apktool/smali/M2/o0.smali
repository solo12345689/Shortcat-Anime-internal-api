.class public LM2/o0;
.super Lq2/L;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field public final c:Landroid/net/Uri;

.field public final d:LP9/u;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/net/Uri;Ljava/util/List;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    invoke-direct {p0, p1, v2, v0, v1}, Lq2/L;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ZI)V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, LM2/o0;->c:Landroid/net/Uri;

    .line 8
    .line 9
    invoke-static {p3}, LP9/u;->w(Ljava/util/Collection;)LP9/u;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, LM2/o0;->d:LP9/u;

    .line 14
    .line 15
    return-void
.end method
