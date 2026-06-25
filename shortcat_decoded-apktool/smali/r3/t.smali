.class public final synthetic Lr3/t;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lt2/n;


# instance fields
.field public final synthetic a:Lr3/u;

.field public final synthetic b:J

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lr3/u;JI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr3/t;->a:Lr3/u;

    .line 5
    .line 6
    iput-wide p2, p0, Lr3/t;->b:J

    .line 7
    .line 8
    iput p4, p0, Lr3/t;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lr3/t;->a:Lr3/u;

    .line 2
    .line 3
    iget-wide v1, p0, Lr3/t;->b:J

    .line 4
    .line 5
    iget v3, p0, Lr3/t;->c:I

    .line 6
    .line 7
    check-cast p1, Lr3/d;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3, p1}, Lr3/u;->h(Lr3/u;JILr3/d;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
