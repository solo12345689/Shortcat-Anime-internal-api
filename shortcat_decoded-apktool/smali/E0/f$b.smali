.class final LE0/f$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE0/f;->J1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/J;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/J;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE0/f$b;->a:Lkotlin/jvm/internal/J;

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
.method public final a(LE0/f;)LK0/H0;
    .locals 1

    .line 1
    invoke-static {p1}, LE0/f;->E1(LE0/f;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, LE0/f$b;->a:Lkotlin/jvm/internal/J;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p1, Lkotlin/jvm/internal/J;->a:Z

    .line 11
    .line 12
    sget-object p1, LK0/H0;->c:LK0/H0;

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    sget-object p1, LK0/H0;->a:LK0/H0;

    .line 16
    .line 17
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LE0/f;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LE0/f$b;->a(LE0/f;)LK0/H0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
