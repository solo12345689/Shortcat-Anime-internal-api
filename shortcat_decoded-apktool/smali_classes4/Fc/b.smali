.class public final synthetic LFc/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:LUb/u;

.field public final synthetic b:Lexpo/modules/notifications/notifications/categories/a;


# direct methods
.method public synthetic constructor <init>(LUb/u;Lexpo/modules/notifications/notifications/categories/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LFc/b;->a:LUb/u;

    .line 5
    .line 6
    iput-object p2, p0, LFc/b;->b:Lexpo/modules/notifications/notifications/categories/a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LFc/b;->a:LUb/u;

    .line 2
    .line 3
    iget-object v1, p0, LFc/b;->b:Lexpo/modules/notifications/notifications/categories/a;

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    check-cast p2, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-static {v0, v1, p1, p2}, Lexpo/modules/notifications/notifications/categories/a;->y(LUb/u;Lexpo/modules/notifications/notifications/categories/a;ILandroid/os/Bundle;)LTd/L;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
