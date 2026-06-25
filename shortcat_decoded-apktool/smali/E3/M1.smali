.class public final synthetic LE3/M1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LE3/S1$d;


# instance fields
.field public final synthetic a:LE3/S1;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:I

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(LE3/S1;Ljava/util/List;IJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE3/M1;->a:LE3/S1;

    .line 5
    .line 6
    iput-object p2, p0, LE3/M1;->b:Ljava/util/List;

    .line 7
    .line 8
    iput p3, p0, LE3/M1;->c:I

    .line 9
    .line 10
    iput-wide p4, p0, LE3/M1;->d:J

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(LE3/r;I)V
    .locals 7

    .line 1
    iget-object v0, p0, LE3/M1;->a:LE3/S1;

    .line 2
    .line 3
    iget-object v1, p0, LE3/M1;->b:Ljava/util/List;

    .line 4
    .line 5
    iget v2, p0, LE3/M1;->c:I

    .line 6
    .line 7
    iget-wide v3, p0, LE3/M1;->d:J

    .line 8
    .line 9
    move-object v5, p1

    .line 10
    move v6, p2

    .line 11
    invoke-static/range {v0 .. v6}, LE3/S1;->O1(LE3/S1;Ljava/util/List;IJLE3/r;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
