.class public final Lg1/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg1/h$a;,
        Lg1/h$b;,
        Lg1/h$c;,
        Lg1/h$d;
    }
.end annotation


# static fields
.field public static final d:Lg1/h$b;

.field private static final e:Lg1/h;


# instance fields
.field private final a:F

.field private final b:I

.field private final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lg1/h$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lg1/h$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lg1/h;->d:Lg1/h$b;

    .line 8
    .line 9
    new-instance v0, Lg1/h;

    .line 10
    .line 11
    sget-object v2, Lg1/h$a;->b:Lg1/h$a$a;

    .line 12
    .line 13
    invoke-virtual {v2}, Lg1/h$a$a;->b()F

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    sget-object v3, Lg1/h$d;->b:Lg1/h$d$a;

    .line 18
    .line 19
    invoke-virtual {v3}, Lg1/h$d$a;->a()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    sget-object v4, Lg1/h$c;->b:Lg1/h$c$a;

    .line 24
    .line 25
    invoke-virtual {v4}, Lg1/h$c$a;->a()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    invoke-direct {v0, v2, v3, v4, v1}, Lg1/h;-><init>(FIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lg1/h;->e:Lg1/h;

    .line 33
    .line 34
    return-void
.end method

.method private constructor <init>(FI)V
    .locals 2

    .line 4
    sget-object v0, Lg1/h$c;->b:Lg1/h$c$a;

    invoke-virtual {v0}, Lg1/h$c$a;->a()I

    move-result v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lg1/h;-><init>(FIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method private constructor <init>(FII)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lg1/h;->a:F

    iput p2, p0, Lg1/h;->b:I

    iput p3, p0, Lg1/h;->c:I

    return-void
.end method

.method public synthetic constructor <init>(FIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lg1/h;-><init>(FII)V

    return-void
.end method

.method public synthetic constructor <init>(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lg1/h;-><init>(FI)V

    return-void
.end method

.method public static final synthetic a()Lg1/h;
    .locals 1

    .line 1
    sget-object v0, Lg1/h;->e:Lg1/h;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public final b()F
    .locals 1

    .line 1
    iget v0, p0, Lg1/h;->a:F

    .line 2
    .line 3
    return v0
.end method

.method public final c()I
    .locals 1

    .line 1
    iget v0, p0, Lg1/h;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public final d()I
    .locals 1

    .line 1
    iget v0, p0, Lg1/h;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lg1/h;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    iget v1, p0, Lg1/h;->a:F

    .line 12
    .line 13
    check-cast p1, Lg1/h;

    .line 14
    .line 15
    iget v3, p1, Lg1/h;->a:F

    .line 16
    .line 17
    invoke-static {v1, v3}, Lg1/h$a;->f(FF)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget v1, p0, Lg1/h;->b:I

    .line 25
    .line 26
    iget v3, p1, Lg1/h;->b:I

    .line 27
    .line 28
    invoke-static {v1, v3}, Lg1/h$d;->f(II)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget v1, p0, Lg1/h;->c:I

    .line 36
    .line 37
    iget p1, p1, Lg1/h;->c:I

    .line 38
    .line 39
    invoke-static {v1, p1}, Lg1/h$c;->f(II)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-nez p1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lg1/h;->a:F

    .line 2
    .line 3
    invoke-static {v0}, Lg1/h$a;->g(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget v1, p0, Lg1/h;->b:I

    .line 10
    .line 11
    invoke-static {v1}, Lg1/h$d;->g(I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v0, v1

    .line 16
    mul-int/lit8 v0, v0, 0x1f

    .line 17
    .line 18
    iget v1, p0, Lg1/h;->c:I

    .line 19
    .line 20
    invoke-static {v1}, Lg1/h$c;->g(I)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    add-int/2addr v0, v1

    .line 25
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "LineHeightStyle(alignment="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget v1, p0, Lg1/h;->a:F

    .line 12
    .line 13
    invoke-static {v1}, Lg1/h$a;->h(F)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", trim="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget v1, p0, Lg1/h;->b:I

    .line 26
    .line 27
    invoke-static {v1}, Lg1/h$d;->j(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v1, ",mode="

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget v1, p0, Lg1/h;->c:I

    .line 40
    .line 41
    invoke-static {v1}, Lg1/h$c;->h(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const/16 v1, 0x29

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    return-object v0
.end method
