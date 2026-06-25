.class LP9/A$b$a;
.super LP9/W;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP9/A$b;->listIterator(I)Ljava/util/ListIterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:LP9/A$b;


# direct methods
.method constructor <init>(LP9/A$b;Ljava/util/ListIterator;)V
    .locals 0

    .line 1
    iput-object p1, p0, LP9/A$b$a;->b:LP9/A$b;

    .line 2
    .line 3
    invoke-direct {p0, p2}, LP9/W;-><init>(Ljava/util/ListIterator;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LP9/A$b$a;->b:LP9/A$b;

    .line 2
    .line 3
    iget-object v0, v0, LP9/A$b;->b:LO9/f;

    .line 4
    .line 5
    invoke-interface {v0, p1}, LO9/f;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
