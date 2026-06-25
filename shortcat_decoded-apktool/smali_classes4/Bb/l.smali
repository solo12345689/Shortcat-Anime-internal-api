.class public final synthetic LBb/l;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LBb/l;->a:Ljava/util/List;

    .line 5
    .line 6
    iput-object p2, p0, LBb/l;->b:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LBb/l;->a:Ljava/util/List;

    .line 2
    .line 3
    iget-object v1, p0, LBb/l;->b:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    check-cast p1, LBb/p;

    .line 6
    .line 7
    invoke-static {v0, v1, p1}, Lexpo/modules/fetch/NativeResponse;->J(Ljava/util/List;Lkotlin/jvm/functions/Function1;LBb/p;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
