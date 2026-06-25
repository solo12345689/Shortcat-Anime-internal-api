.class public final Lb4/b$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb4/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lb4/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(FF)Lb4/b;
    .locals 2

    .line 1
    new-instance v0, Lb4/b;

    .line 2
    .line 3
    sget-object v1, Lb4/c;->b:Lb4/c$a;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Lb4/c$a;->a(F)Lb4/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object v1, Lb4/a;->b:Lb4/a$a;

    .line 10
    .line 11
    invoke-virtual {v1, p2}, Lb4/a$a;->a(F)Lb4/a;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, p1, p2, v1}, Lb4/b;-><init>(Lb4/c;Lb4/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method
