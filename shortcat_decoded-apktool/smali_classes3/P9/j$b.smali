.class LP9/j$b;
.super LP9/j$e;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP9/j;->D()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:LP9/j;


# direct methods
.method constructor <init>(LP9/j;)V
    .locals 1

    .line 1
    iput-object p1, p0, LP9/j$b;->e:LP9/j;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, v0}, LP9/j$e;-><init>(LP9/j;LP9/j$a;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method bridge synthetic c(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LP9/j$b;->e(I)Ljava/util/Map$Entry;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method e(I)Ljava/util/Map$Entry;
    .locals 2

    .line 1
    new-instance v0, LP9/j$g;

    .line 2
    .line 3
    iget-object v1, p0, LP9/j$b;->e:LP9/j;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, LP9/j$g;-><init>(LP9/j;I)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
