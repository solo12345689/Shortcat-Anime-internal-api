.class public Landroidx/lifecycle/W;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/W$a;,
        Landroidx/lifecycle/W$b;,
        Landroidx/lifecycle/W$c;,
        Landroidx/lifecycle/W$d;,
        Landroidx/lifecycle/W$e;
    }
.end annotation


# static fields
.field public static final b:Landroidx/lifecycle/W$b;

.field public static final c:Lm2/a$c;


# instance fields
.field private final a:Lm2/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/lifecycle/W$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/lifecycle/W$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/lifecycle/W;->b:Landroidx/lifecycle/W$b;

    .line 8
    .line 9
    sget-object v0, Lm2/a;->b:Lm2/a$a;

    .line 10
    .line 11
    new-instance v0, Landroidx/lifecycle/W$f;

    .line 12
    .line 13
    invoke-direct {v0}, Landroidx/lifecycle/W$f;-><init>()V

    .line 14
    .line 15
    .line 16
    sput-object v0, Landroidx/lifecycle/W;->c:Lm2/a$c;

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/X;Landroidx/lifecycle/W$c;)V
    .locals 7

    .line 1
    const-string v0, "store"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Landroidx/lifecycle/W;-><init>(Landroidx/lifecycle/X;Landroidx/lifecycle/W$c;Lm2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/X;Landroidx/lifecycle/W$c;Lm2/a;)V
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultCreationExtras"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    new-instance v0, Lm2/d;

    invoke-direct {v0, p1, p2, p3}, Lm2/d;-><init>(Landroidx/lifecycle/X;Landroidx/lifecycle/W$c;Lm2/a;)V

    invoke-direct {p0, v0}, Landroidx/lifecycle/W;-><init>(Lm2/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/lifecycle/X;Landroidx/lifecycle/W$c;Lm2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 4
    sget-object p3, Lm2/a$b;->c:Lm2/a$b;

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Landroidx/lifecycle/W;-><init>(Landroidx/lifecycle/X;Landroidx/lifecycle/W$c;Lm2/a;)V

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/Y;)V
    .locals 3

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-interface {p1}, Landroidx/lifecycle/Y;->getViewModelStore()Landroidx/lifecycle/X;

    move-result-object v0

    .line 8
    sget-object v1, Lo2/h;->a:Lo2/h;

    invoke-virtual {v1, p1}, Lo2/h;->b(Landroidx/lifecycle/Y;)Landroidx/lifecycle/W$c;

    move-result-object v2

    .line 9
    invoke-virtual {v1, p1}, Lo2/h;->a(Landroidx/lifecycle/Y;)Lm2/a;

    move-result-object p1

    .line 10
    invoke-direct {p0, v0, v2, p1}, Landroidx/lifecycle/W;-><init>(Landroidx/lifecycle/X;Landroidx/lifecycle/W$c;Lm2/a;)V

    return-void
.end method

.method private constructor <init>(Lm2/d;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/lifecycle/W;->a:Lm2/d;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Landroidx/lifecycle/U;
    .locals 1

    .line 1
    const-string v0, "modelClass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lhe/a;->e(Ljava/lang/Class;)Lpe/d;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0, p1}, Landroidx/lifecycle/W;->c(Lpe/d;)Landroidx/lifecycle/U;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public final b(Ljava/lang/String;Lpe/d;)Landroidx/lifecycle/U;
    .locals 1

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "modelClass"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/lifecycle/W;->a:Lm2/d;

    .line 12
    .line 13
    invoke-virtual {v0, p2, p1}, Lm2/d;->d(Lpe/d;Ljava/lang/String;)Landroidx/lifecycle/U;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final c(Lpe/d;)Landroidx/lifecycle/U;
    .locals 3

    .line 1
    const-string v0, "modelClass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/lifecycle/W;->a:Lm2/d;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x2

    .line 10
    invoke-static {v0, p1, v1, v2, v1}, Lm2/d;->e(Lm2/d;Lpe/d;Ljava/lang/String;ILjava/lang/Object;)Landroidx/lifecycle/U;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method
