.class public final LH7/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH7/a$a;
    }
.end annotation


# static fields
.field public static final b:LH7/a$a;


# instance fields
.field private a:LH7/r;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LH7/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LH7/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LH7/a;->b:LH7/a$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private constructor <init>(LH7/r;)V
    .locals 0

    .line 3
    invoke-direct {p0}, LH7/a;-><init>()V

    .line 4
    iput-object p1, p0, LH7/a;->a:LH7/r;

    return-void
.end method

.method public synthetic constructor <init>(LH7/r;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LH7/a;-><init>(LH7/r;)V

    return-void
.end method


# virtual methods
.method public final a(FF)Landroid/graphics/Shader;
    .locals 1

    .line 1
    iget-object v0, p0, LH7/a;->a:LH7/r;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "gradient"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    invoke-interface {v0, p1, p2}, LH7/r;->a(FF)Landroid/graphics/Shader;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
