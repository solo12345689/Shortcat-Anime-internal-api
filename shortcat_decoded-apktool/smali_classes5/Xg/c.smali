.class public LXg/c;
.super Ljava/lang/Object;

# interfaces
.implements LFg/b;


# static fields
.field public static final j:LXg/c;

.field public static final k:LXg/c;

.field public static final l:LXg/c;


# instance fields
.field private a:Ljava/lang/String;

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private final h:I

.field private i:LXg/a;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, LXg/c;

    .line 2
    .line 3
    const/4 v7, 0x3

    .line 4
    const/16 v8, 0x80

    .line 5
    .line 6
    const-string v1, "bike128"

    .line 7
    .line 8
    const/16 v2, 0x3023

    .line 9
    .line 10
    const/16 v3, 0x8e

    .line 11
    .line 12
    const/16 v4, 0x86

    .line 13
    .line 14
    const/16 v5, 0x100

    .line 15
    .line 16
    const/4 v6, 0x5

    .line 17
    invoke-direct/range {v0 .. v8}, LXg/c;-><init>(Ljava/lang/String;IIIIIII)V

    .line 18
    .line 19
    .line 20
    sput-object v0, LXg/c;->j:LXg/c;

    .line 21
    .line 22
    new-instance v1, LXg/c;

    .line 23
    .line 24
    const/4 v8, 0x3

    .line 25
    const/16 v9, 0xc0

    .line 26
    .line 27
    const-string v2, "bike192"

    .line 28
    .line 29
    const/16 v3, 0x6053

    .line 30
    .line 31
    const/16 v4, 0xce

    .line 32
    .line 33
    const/16 v5, 0xc7

    .line 34
    .line 35
    const/16 v6, 0x100

    .line 36
    .line 37
    const/4 v7, 0x5

    .line 38
    invoke-direct/range {v1 .. v9}, LXg/c;-><init>(Ljava/lang/String;IIIIIII)V

    .line 39
    .line 40
    .line 41
    sput-object v1, LXg/c;->k:LXg/c;

    .line 42
    .line 43
    new-instance v2, LXg/c;

    .line 44
    .line 45
    const/4 v9, 0x3

    .line 46
    const/16 v10, 0x100

    .line 47
    .line 48
    const-string v3, "bike256"

    .line 49
    .line 50
    const v4, 0xa00d

    .line 51
    .line 52
    .line 53
    const/16 v5, 0x112

    .line 54
    .line 55
    const/16 v6, 0x108

    .line 56
    .line 57
    const/16 v7, 0x100

    .line 58
    .line 59
    const/4 v8, 0x5

    .line 60
    invoke-direct/range {v2 .. v10}, LXg/c;-><init>(Ljava/lang/String;IIIIIII)V

    .line 61
    .line 62
    .line 63
    sput-object v2, LXg/c;->l:LXg/c;

    .line 64
    .line 65
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IIIIIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LXg/c;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, LXg/c;->b:I

    .line 7
    .line 8
    iput p3, p0, LXg/c;->c:I

    .line 9
    .line 10
    iput p4, p0, LXg/c;->d:I

    .line 11
    .line 12
    iput p5, p0, LXg/c;->e:I

    .line 13
    .line 14
    iput p6, p0, LXg/c;->f:I

    .line 15
    .line 16
    iput p7, p0, LXg/c;->g:I

    .line 17
    .line 18
    iput p8, p0, LXg/c;->h:I

    .line 19
    .line 20
    new-instance p1, LXg/a;

    .line 21
    .line 22
    invoke-direct/range {p1 .. p7}, LXg/a;-><init>(IIIIII)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, LXg/c;->i:LXg/a;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LXg/c;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, LXg/c;->b:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x7

    .line 4
    .line 5
    div-int/lit8 v0, v0, 0x8

    .line 6
    .line 7
    return v0
.end method
