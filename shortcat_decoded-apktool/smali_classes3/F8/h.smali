.class public abstract LF8/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:LF8/n;

.field protected final b:LF8/f;

.field private final c:Ljava/util/List;


# direct methods
.method protected constructor <init>(LF8/n;Lcom/google/android/gms/common/util/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, LF8/h;->a:LF8/n;

    .line 8
    .line 9
    new-instance p1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LF8/h;->c:Ljava/util/List;

    .line 15
    .line 16
    new-instance p1, LF8/f;

    .line 17
    .line 18
    invoke-direct {p1, p0, p2}, LF8/f;-><init>(LF8/h;Lcom/google/android/gms/common/util/d;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, LF8/f;->a()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, LF8/h;->b:LF8/f;

    .line 25
    .line 26
    return-void
.end method
