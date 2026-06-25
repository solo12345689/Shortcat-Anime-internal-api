.class public final synthetic LB2/q;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lt2/v$a;


# instance fields
.field public final synthetic a:LB2/b$a;

.field public final synthetic b:Z

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(LB2/b$a;ZI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LB2/q;->a:LB2/b$a;

    .line 5
    .line 6
    iput-boolean p2, p0, LB2/q;->b:Z

    .line 7
    .line 8
    iput p3, p0, LB2/q;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, LB2/q;->a:LB2/b$a;

    .line 2
    .line 3
    iget-boolean v1, p0, LB2/q;->b:Z

    .line 4
    .line 5
    iget v2, p0, LB2/q;->c:I

    .line 6
    .line 7
    check-cast p1, LB2/b;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, p1}, LB2/x0;->g1(LB2/b$a;ZILB2/b;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
