.class public final synthetic LS2/G;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:LS2/K$a;

.field public final synthetic b:J

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(LS2/K$a;JI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LS2/G;->a:LS2/K$a;

    .line 5
    .line 6
    iput-wide p2, p0, LS2/G;->b:J

    .line 7
    .line 8
    iput p4, p0, LS2/G;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, LS2/G;->a:LS2/K$a;

    .line 2
    .line 3
    iget-wide v1, p0, LS2/G;->b:J

    .line 4
    .line 5
    iget v3, p0, LS2/G;->c:I

    .line 6
    .line 7
    invoke-static {v0, v1, v2, v3}, LS2/K$a;->g(LS2/K$a;JI)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
