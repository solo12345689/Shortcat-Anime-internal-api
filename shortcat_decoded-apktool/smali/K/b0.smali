.class public final synthetic LK/b0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK/i0;


# instance fields
.field public final synthetic a:LK/c0;

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(LK/c0;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LK/b0;->a:LK/c0;

    .line 5
    .line 6
    iput p2, p0, LK/b0;->b:I

    .line 7
    .line 8
    iput p3, p0, LK/b0;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(LK/g0;)LK/f0;
    .locals 3

    .line 1
    iget-object v0, p0, LK/b0;->a:LK/c0;

    .line 2
    .line 3
    iget v1, p0, LK/b0;->b:I

    .line 4
    .line 5
    iget v2, p0, LK/b0;->c:I

    .line 6
    .line 7
    invoke-static {v0, v1, v2, p1}, LK/c0;->a(LK/c0;IILK/g0;)LK/f0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
