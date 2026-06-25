.class public final Ldg/y$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldg/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldg/y$c$a;
    }
.end annotation


# static fields
.field public static final c:Ldg/y$c$a;


# instance fields
.field private final a:Ldg/t;

.field private final b:Ldg/D;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldg/y$c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ldg/y$c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldg/y$c;->c:Ldg/y$c$a;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>(Ldg/t;Ldg/D;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Ldg/y$c;->a:Ldg/t;

    .line 4
    iput-object p2, p0, Ldg/y$c;->b:Ldg/D;

    return-void
.end method

.method public synthetic constructor <init>(Ldg/t;Ldg/D;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ldg/y$c;-><init>(Ldg/t;Ldg/D;)V

    return-void
.end method


# virtual methods
.method public final a()Ldg/D;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/y$c;->b:Ldg/D;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Ldg/t;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/y$c;->a:Ldg/t;

    .line 2
    .line 3
    return-object v0
.end method
