.class public final synthetic LE3/T2;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LE3/X2$a;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:I

.field public final synthetic c:LE3/Y2;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ILE3/Y2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE3/T2;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, LE3/T2;->b:I

    .line 7
    .line 8
    iput-object p3, p0, LE3/T2;->c:LE3/Y2;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(LE3/S1;)V
    .locals 3

    .line 1
    iget-object v0, p0, LE3/T2;->a:Ljava/lang/String;

    .line 2
    .line 3
    iget v1, p0, LE3/T2;->b:I

    .line 4
    .line 5
    iget-object v2, p0, LE3/T2;->c:LE3/Y2;

    .line 6
    .line 7
    invoke-static {p1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-static {v0, v1, v2, p1}, LE3/X2;->T3(Ljava/lang/String;ILE3/Y2;LE3/x;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
