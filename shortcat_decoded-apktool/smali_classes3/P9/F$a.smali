.class LP9/F$a;
.super LP9/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP9/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field transient g:LO9/t;


# direct methods
.method constructor <init>(Ljava/util/Map;LO9/t;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LP9/c;-><init>(Ljava/util/Map;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, LO9/n;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, LO9/t;

    .line 9
    .line 10
    iput-object p1, p0, LP9/F$a;->g:LO9/t;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method protected D()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LP9/F$a;->g:LO9/t;

    .line 2
    .line 3
    invoke-interface {v0}, LO9/t;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/List;

    .line 8
    .line 9
    return-object v0
.end method

.method d()Ljava/util/Map;
    .locals 1

    .line 1
    invoke-virtual {p0}, LP9/d;->v()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method f()Ljava/util/Set;
    .locals 1

    .line 1
    invoke-virtual {p0}, LP9/d;->w()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method protected bridge synthetic t()Ljava/util/Collection;
    .locals 1

    .line 1
    invoke-virtual {p0}, LP9/F$a;->D()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
