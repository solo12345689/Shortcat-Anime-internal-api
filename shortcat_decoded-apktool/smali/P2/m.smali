.class public final synthetic LP2/m;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LO9/o;


# instance fields
.field public final synthetic a:LP2/n;

.field public final synthetic b:LP2/n$e;


# direct methods
.method public synthetic constructor <init>(LP2/n;LP2/n$e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LP2/m;->a:LP2/n;

    .line 5
    .line 6
    iput-object p2, p0, LP2/m;->b:LP2/n$e;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    iget-object v0, p0, LP2/m;->a:LP2/n;

    .line 2
    .line 3
    iget-object v1, p0, LP2/m;->b:LP2/n$e;

    .line 4
    .line 5
    check-cast p1, Lq2/x;

    .line 6
    .line 7
    invoke-static {v0, v1, p1}, LP2/n;->t(LP2/n;LP2/n$e;Lq2/x;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method
