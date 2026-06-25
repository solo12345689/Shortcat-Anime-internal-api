.class public final synthetic LE3/V5;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LE3/I6$e;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:LE3/Y2;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;IILE3/Y2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE3/V5;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, LE3/V5;->b:I

    .line 7
    .line 8
    iput p3, p0, LE3/V5;->c:I

    .line 9
    .line 10
    iput-object p4, p0, LE3/V5;->d:LE3/Y2;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(LE3/I3;LE3/h3$g;I)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, LE3/V5;->a:Ljava/lang/String;

    .line 2
    .line 3
    iget v1, p0, LE3/V5;->b:I

    .line 4
    .line 5
    iget v2, p0, LE3/V5;->c:I

    .line 6
    .line 7
    iget-object v3, p0, LE3/V5;->d:LE3/Y2;

    .line 8
    .line 9
    invoke-static {p1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    move-object v5, p2

    .line 14
    move v6, p3

    .line 15
    invoke-static/range {v0 .. v6}, LE3/I6;->K4(Ljava/lang/String;IILE3/Y2;LE3/Z2;LE3/h3$g;I)Lcom/google/common/util/concurrent/p;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method
