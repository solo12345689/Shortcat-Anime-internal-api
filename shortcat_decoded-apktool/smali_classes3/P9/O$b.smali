.class final LP9/O$b;
.super LP9/w;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP9/O;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private final transient c:LP9/v;

.field private final transient d:LP9/u;


# direct methods
.method constructor <init>(LP9/v;LP9/u;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LP9/w;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LP9/O$b;->c:LP9/v;

    .line 5
    .line 6
    iput-object p2, p0, LP9/O$b;->d:LP9/u;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public b()LP9/u;
    .locals 1

    .line 1
    iget-object v0, p0, LP9/O$b;->d:LP9/u;

    .line 2
    .line 3
    return-object v0
.end method

.method c([Ljava/lang/Object;I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LP9/O$b;->b()LP9/u;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2}, LP9/u;->c([Ljava/lang/Object;I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LP9/O$b;->c:LP9/v;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LP9/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return p1
.end method

.method i()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    invoke-virtual {p0}, LP9/O$b;->l()LP9/X;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public l()LP9/X;
    .locals 1

    .line 1
    invoke-virtual {p0}, LP9/O$b;->b()LP9/u;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LP9/u;->l()LP9/X;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public size()I
    .locals 1

    .line 1
    iget-object v0, p0, LP9/O$b;->c:LP9/v;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
