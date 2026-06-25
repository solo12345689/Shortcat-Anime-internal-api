.class public interface abstract Landroidx/lifecycle/W$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/W;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/W$c$a;
    }
.end annotation


# static fields
.field public static final a:Landroidx/lifecycle/W$c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Landroidx/lifecycle/W$c$a;->a:Landroidx/lifecycle/W$c$a;

    .line 2
    .line 3
    sput-object v0, Landroidx/lifecycle/W$c;->a:Landroidx/lifecycle/W$c$a;

    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public create(Ljava/lang/Class;)Landroidx/lifecycle/U;
    .locals 1

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object p1, Lo2/h;->a:Lo2/h;

    invoke-virtual {p1}, Lo2/h;->d()Landroidx/lifecycle/U;

    move-result-object p1

    return-object p1
.end method

.method public create(Ljava/lang/Class;Lm2/a;)Landroidx/lifecycle/U;
    .locals 1

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-interface {p0, p1}, Landroidx/lifecycle/W$c;->create(Ljava/lang/Class;)Landroidx/lifecycle/U;

    move-result-object p1

    return-object p1
.end method

.method public create(Lpe/d;Lm2/a;)Landroidx/lifecycle/U;
    .locals 1

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {p1}, Lhe/a;->b(Lpe/d;)Ljava/lang/Class;

    move-result-object p1

    invoke-interface {p0, p1, p2}, Landroidx/lifecycle/W$c;->create(Ljava/lang/Class;Lm2/a;)Landroidx/lifecycle/U;

    move-result-object p1

    return-object p1
.end method
