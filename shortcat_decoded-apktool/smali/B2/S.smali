.class public final synthetic LB2/S;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lt2/v$a;


# instance fields
.field public final synthetic a:LB2/b$a;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(LB2/b$a;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LB2/S;->a:LB2/b$a;

    .line 5
    .line 6
    iput-wide p2, p0, LB2/S;->b:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, LB2/S;->a:LB2/b$a;

    .line 2
    .line 3
    iget-wide v1, p0, LB2/S;->b:J

    .line 4
    .line 5
    check-cast p1, LB2/b;

    .line 6
    .line 7
    invoke-static {v0, v1, v2, p1}, LB2/x0;->X0(LB2/b$a;JLB2/b;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
