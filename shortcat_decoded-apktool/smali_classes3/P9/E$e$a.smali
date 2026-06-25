.class LP9/E$e$a;
.super LP9/E$d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP9/E$e;->b(I)LP9/E$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:LP9/E$e;


# direct methods
.method constructor <init>(LP9/E$e;I)V
    .locals 0

    .line 1
    iput p2, p0, LP9/E$e$a;->a:I

    .line 2
    .line 3
    iput-object p1, p0, LP9/E$e$a;->b:LP9/E$e;

    .line 4
    .line 5
    invoke-direct {p0}, LP9/E$d;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public e()LP9/z;
    .locals 3

    .line 1
    iget-object v0, p0, LP9/E$e$a;->b:LP9/E$e;

    .line 2
    .line 3
    invoke-virtual {v0}, LP9/E$e;->c()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, LP9/E$c;

    .line 8
    .line 9
    iget v2, p0, LP9/E$e$a;->a:I

    .line 10
    .line 11
    invoke-direct {v1, v2}, LP9/E$c;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, LP9/F;->b(Ljava/util/Map;LO9/t;)LP9/z;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method
