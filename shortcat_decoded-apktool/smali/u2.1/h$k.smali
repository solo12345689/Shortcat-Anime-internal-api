.class public final Lu2/h$k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu2/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "k"
.end annotation


# instance fields
.field public final a:Lu2/h$b;

.field public final b:LP9/u;

.field public final c:Lu2/h$d;

.field public final d:Lu2/h$f;

.field public final e:Lu2/h$j;


# direct methods
.method public constructor <init>(Lu2/h$b;Ljava/util/List;Lu2/h$d;Lu2/h$f;Lu2/h$j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu2/h$k;->a:Lu2/h$b;

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    invoke-static {p2}, LP9/u;->w(Ljava/util/Collection;)LP9/u;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :goto_0
    iput-object p1, p0, Lu2/h$k;->b:LP9/u;

    .line 18
    .line 19
    iput-object p3, p0, Lu2/h$k;->c:Lu2/h$d;

    .line 20
    .line 21
    iput-object p4, p0, Lu2/h$k;->d:Lu2/h$f;

    .line 22
    .line 23
    iput-object p5, p0, Lu2/h$k;->e:Lu2/h$j;

    .line 24
    .line 25
    return-void
.end method
