.class public final LI1/g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI1/g$a;,
        LI1/g$b;,
        LI1/g$c;,
        LI1/g$d;,
        LI1/g$e;
    }
.end annotation


# static fields
.field public static final b:LI1/g$a;


# instance fields
.field private final a:LI1/g$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LI1/g$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LI1/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LI1/g;->b:LI1/g$a;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>(Landroid/app/Activity;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    new-instance v0, LI1/g$c;

    invoke-direct {v0, p1}, LI1/g$c;-><init>(Landroid/app/Activity;)V

    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, LI1/g$b;

    invoke-direct {v0, p1}, LI1/g$b;-><init>(Landroid/app/Activity;)V

    .line 5
    :goto_0
    iput-object v0, p0, LI1/g;->a:LI1/g$b;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Activity;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LI1/g;-><init>(Landroid/app/Activity;)V

    return-void
.end method

.method public static final synthetic a(LI1/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LI1/g;->b()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final b()V
    .locals 1

    .line 1
    iget-object v0, p0, LI1/g;->a:LI1/g$b;

    .line 2
    .line 3
    invoke-virtual {v0}, LI1/g$b;->i()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(LI1/g$e;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LI1/g;->a:LI1/g$b;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LI1/g$b;->j(LI1/g$e;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
