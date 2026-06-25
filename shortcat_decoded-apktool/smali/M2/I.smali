.class public final synthetic LM2/I;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lt2/n;


# instance fields
.field public final synthetic a:LM2/L$a;

.field public final synthetic b:LM2/y;

.field public final synthetic c:LM2/B;


# direct methods
.method public synthetic constructor <init>(LM2/L$a;LM2/y;LM2/B;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LM2/I;->a:LM2/L$a;

    .line 5
    .line 6
    iput-object p2, p0, LM2/I;->b:LM2/y;

    .line 7
    .line 8
    iput-object p3, p0, LM2/I;->c:LM2/B;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, LM2/I;->a:LM2/L$a;

    .line 2
    .line 3
    iget-object v1, p0, LM2/I;->b:LM2/y;

    .line 4
    .line 5
    iget-object v2, p0, LM2/I;->c:LM2/B;

    .line 6
    .line 7
    check-cast p1, LM2/L;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, p1}, LM2/L$a;->g(LM2/L$a;LM2/y;LM2/B;LM2/L;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
