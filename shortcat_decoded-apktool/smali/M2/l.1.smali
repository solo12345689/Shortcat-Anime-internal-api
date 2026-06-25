.class public final synthetic LM2/l;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LU2/u;


# instance fields
.field public final synthetic b:LM2/r;

.field public final synthetic c:Lq2/x;


# direct methods
.method public synthetic constructor <init>(LM2/r;Lq2/x;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LM2/l;->b:LM2/r;

    .line 5
    .line 6
    iput-object p2, p0, LM2/l;->c:Lq2/x;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final f()[LU2/p;
    .locals 2

    .line 1
    iget-object v0, p0, LM2/l;->b:LM2/r;

    .line 2
    .line 3
    iget-object v1, p0, LM2/l;->c:Lq2/x;

    .line 4
    .line 5
    invoke-static {v0, v1}, LM2/r;->g(LM2/r;Lq2/x;)[LU2/p;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
