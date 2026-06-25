.class final LP/i$c;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP/i;->Y(LR0/C;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LP/i;


# direct methods
.method constructor <init>(LP/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, LP/i$c;->a:LP/i;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(LU0/e;)Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, LP/i$c;->a:LP/i;

    .line 2
    .line 3
    invoke-virtual {p1}, LU0/e;->j()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, LP/i;->K1(LP/i;Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, LP/i$c;->a:LP/i;

    .line 11
    .line 12
    invoke-static {p1}, LP/i;->J1(LP/i;)V

    .line 13
    .line 14
    .line 15
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 16
    .line 17
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LU0/e;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LP/i$c;->a(LU0/e;)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
