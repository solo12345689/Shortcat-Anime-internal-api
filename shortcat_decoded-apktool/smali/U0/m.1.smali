.class public final synthetic LU0/m;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ls0/m1;

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Ls0/m1;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LU0/m;->a:Ls0/m1;

    .line 5
    .line 6
    iput p2, p0, LU0/m;->b:I

    .line 7
    .line 8
    iput p3, p0, LU0/m;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LU0/m;->a:Ls0/m1;

    .line 2
    .line 3
    iget v1, p0, LU0/m;->b:I

    .line 4
    .line 5
    iget v2, p0, LU0/m;->c:I

    .line 6
    .line 7
    check-cast p1, LU0/w;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, p1}, LU0/n;->b(Ls0/m1;IILU0/w;)LTd/L;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
