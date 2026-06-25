.class public Landroidx/lifecycle/W$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/lifecycle/W$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/W;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/W$d$a;
    }
.end annotation


# static fields
.field public static final Companion:Landroidx/lifecycle/W$d$a;

.field public static final VIEW_MODEL_KEY:Lm2/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm2/a$c;"
        }
    .end annotation
.end field

.field private static _instance:Landroidx/lifecycle/W$d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/lifecycle/W$d$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/lifecycle/W$d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/lifecycle/W$d;->Companion:Landroidx/lifecycle/W$d$a;

    .line 8
    .line 9
    sget-object v0, Landroidx/lifecycle/W;->c:Lm2/a$c;

    .line 10
    .line 11
    sput-object v0, Landroidx/lifecycle/W$d;->VIEW_MODEL_KEY:Lm2/a$c;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$get_instance$cp()Landroidx/lifecycle/W$d;
    .locals 1

    .line 1
    sget-object v0, Landroidx/lifecycle/W$d;->_instance:Landroidx/lifecycle/W$d;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$set_instance$cp(Landroidx/lifecycle/W$d;)V
    .locals 0

    .line 1
    sput-object p0, Landroidx/lifecycle/W$d;->_instance:Landroidx/lifecycle/W$d;

    .line 2
    .line 3
    return-void
.end method

.method public static final getInstance()Landroidx/lifecycle/W$d;
    .locals 1

    .line 1
    sget-object v0, Landroidx/lifecycle/W$d;->Companion:Landroidx/lifecycle/W$d$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/lifecycle/W$d$a;->a()Landroidx/lifecycle/W$d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method


# virtual methods
.method public create(Ljava/lang/Class;)Landroidx/lifecycle/U;
    .locals 1

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lo2/e;->a:Lo2/e;

    invoke-virtual {v0, p1}, Lo2/e;->a(Ljava/lang/Class;)Landroidx/lifecycle/U;

    move-result-object p1

    return-object p1
.end method

.method public create(Ljava/lang/Class;Lm2/a;)Landroidx/lifecycle/U;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/U;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lm2/a;",
            ")TT;"
        }
    .end annotation

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0, p1}, Landroidx/lifecycle/W$d;->create(Ljava/lang/Class;)Landroidx/lifecycle/U;

    move-result-object p1

    return-object p1
.end method

.method public create(Lpe/d;Lm2/a;)Landroidx/lifecycle/U;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/U;",
            ">(",
            "Lpe/d;",
            "Lm2/a;",
            ")TT;"
        }
    .end annotation

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {p1}, Lhe/a;->b(Lpe/d;)Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/W$d;->create(Ljava/lang/Class;Lm2/a;)Landroidx/lifecycle/U;

    move-result-object p1

    return-object p1
.end method
