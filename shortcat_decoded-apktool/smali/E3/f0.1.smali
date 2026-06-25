.class public final synthetic LE3/f0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LE3/S1$d;


# instance fields
.field public final synthetic a:LE3/S1;

.field public final synthetic b:I

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(LE3/S1;IJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE3/f0;->a:LE3/S1;

    .line 5
    .line 6
    iput p2, p0, LE3/f0;->b:I

    .line 7
    .line 8
    iput-wide p3, p0, LE3/f0;->c:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(LE3/r;I)V
    .locals 6

    .line 1
    iget-object v0, p0, LE3/f0;->a:LE3/S1;

    .line 2
    .line 3
    iget v1, p0, LE3/f0;->b:I

    .line 4
    .line 5
    iget-wide v2, p0, LE3/f0;->c:J

    .line 6
    .line 7
    move-object v4, p1

    .line 8
    move v5, p2

    .line 9
    invoke-static/range {v0 .. v5}, LE3/S1;->i2(LE3/S1;IJLE3/r;I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
