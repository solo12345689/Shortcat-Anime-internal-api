.class public final LNb/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lv7/g;


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Ljava/lang/ref/WeakReference;)V
    .locals 1

    .line 1
    const-string v0, "expoImageViewWrapper"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LNb/b;->a:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a(JJZ)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p3, v0

    .line 4
    .line 5
    if-lez v0, :cond_1

    .line 6
    .line 7
    if-eqz p5, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object p5, p0, LNb/b;->a:Ljava/lang/ref/WeakReference;

    .line 11
    .line 12
    invoke-virtual {p5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p5

    .line 16
    check-cast p5, Lexpo/modules/image/ExpoImageViewWrapper;

    .line 17
    .line 18
    if-eqz p5, :cond_1

    .line 19
    .line 20
    invoke-virtual {p5}, Lexpo/modules/image/ExpoImageViewWrapper;->getOnProgress$expo_image_release()Lvc/b;

    .line 21
    .line 22
    .line 23
    move-result-object p5

    .line 24
    if-eqz p5, :cond_1

    .line 25
    .line 26
    new-instance v0, Lexpo/modules/image/records/ImageProgressEvent;

    .line 27
    .line 28
    long-to-int p1, p1

    .line 29
    long-to-int p2, p3

    .line 30
    invoke-direct {v0, p1, p2}, Lexpo/modules/image/records/ImageProgressEvent;-><init>(II)V

    .line 31
    .line 32
    .line 33
    invoke-interface {p5, v0}, Lvc/b;->invoke(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    :goto_0
    return-void
.end method
