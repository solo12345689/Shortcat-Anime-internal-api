.class public final enum Lse/d0$d;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lse/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401c
    name = "d"
.end annotation


# static fields
.field public static final enum a:Lse/d0$d;

.field public static final enum b:Lse/d0$d;

.field private static final synthetic c:[Lse/d0$d;

.field private static final synthetic d:Lkotlin/enums/EnumEntries;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lse/d0$d;

    .line 2
    .line 3
    const-string v1, "DECLARED"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lse/d0$d;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lse/d0$d;->a:Lse/d0$d;

    .line 10
    .line 11
    new-instance v0, Lse/d0$d;

    .line 12
    .line 13
    const-string v1, "INHERITED"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lse/d0$d;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lse/d0$d;->b:Lse/d0$d;

    .line 20
    .line 21
    invoke-static {}, Lse/d0$d;->a()[Lse/d0$d;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lse/d0$d;->c:[Lse/d0$d;

    .line 26
    .line 27
    invoke-static {v0}, Lbe/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lse/d0$d;->d:Lkotlin/enums/EnumEntries;

    .line 32
    .line 33
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final synthetic a()[Lse/d0$d;
    .locals 2

    .line 1
    sget-object v0, Lse/d0$d;->a:Lse/d0$d;

    .line 2
    .line 3
    sget-object v1, Lse/d0$d;->b:Lse/d0$d;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Lse/d0$d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lse/d0$d;
    .locals 1

    .line 1
    const-class v0, Lse/d0$d;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lse/d0$d;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lse/d0$d;
    .locals 1

    .line 1
    sget-object v0, Lse/d0$d;->c:[Lse/d0$d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lse/d0$d;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final b(Lye/b;)Z
    .locals 3

    .line 1
    const-string v0, "member"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lye/b;->h()Lye/b$a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Lye/b$a;->a()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    sget-object v0, Lse/d0$d;->a:Lse/d0$d;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x1

    .line 18
    if-ne p0, v0, :cond_0

    .line 19
    .line 20
    move v0, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v0, v1

    .line 23
    :goto_0
    if-ne p1, v0, :cond_1

    .line 24
    .line 25
    return v2

    .line 26
    :cond_1
    return v1
.end method
