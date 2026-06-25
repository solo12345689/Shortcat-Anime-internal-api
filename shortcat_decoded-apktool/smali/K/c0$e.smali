.class final LK/c0$e;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/c0;->f([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LK/c0;

.field final synthetic b:[Ljava/lang/Object;

.field final synthetic c:Lkotlin/jvm/functions/Function1;

.field final synthetic d:I


# direct methods
.method constructor <init>(LK/c0;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/c0$e;->a:LK/c0;

    .line 2
    .line 3
    iput-object p2, p0, LK/c0$e;->b:[Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, LK/c0$e;->c:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    iput p4, p0, LK/c0$e;->d:I

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LK/c0$e;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 3

    .line 2
    iget-object p2, p0, LK/c0$e;->a:LK/c0;

    iget-object v0, p0, LK/c0$e;->b:[Ljava/lang/Object;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LK/c0$e;->c:Lkotlin/jvm/functions/Function1;

    iget v2, p0, LK/c0$e;->d:I

    or-int/lit8 v2, v2, 0x1

    invoke-static {v2}, LY/g1;->a(I)I

    move-result v2

    invoke-static {p2, v0, v1, p1, v2}, LK/c0;->j(LK/c0;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LY/m;I)V

    return-void
.end method
