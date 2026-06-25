.class Lp/b$a;
.super Lp/b$e;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# direct methods
.method constructor <init>(Lp/b$c;Lp/b$c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lp/b$e;-><init>(Lp/b$c;Lp/b$c;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method c(Lp/b$c;)Lp/b$c;
    .locals 0

    .line 1
    iget-object p1, p1, Lp/b$c;->d:Lp/b$c;

    .line 2
    .line 3
    return-object p1
.end method

.method d(Lp/b$c;)Lp/b$c;
    .locals 0

    .line 1
    iget-object p1, p1, Lp/b$c;->c:Lp/b$c;

    .line 2
    .line 3
    return-object p1
.end method
