.class public final synthetic LS2/F;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:LS2/K$a;

.field public final synthetic b:I

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(LS2/K$a;IJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LS2/F;->a:LS2/K$a;

    .line 5
    .line 6
    iput p2, p0, LS2/F;->b:I

    .line 7
    .line 8
    iput-wide p3, p0, LS2/F;->c:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, LS2/F;->a:LS2/K$a;

    .line 2
    .line 3
    iget v1, p0, LS2/F;->b:I

    .line 4
    .line 5
    iget-wide v2, p0, LS2/F;->c:J

    .line 6
    .line 7
    invoke-static {v0, v1, v2, v3}, LS2/K$a;->c(LS2/K$a;IJ)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
